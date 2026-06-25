from fastapi import FastAPI
from pydantic import BaseModel
from langchain_core.prompts import ChatPromptTemplate
from langchain_ollama import ChatOllama


llm = ChatOllama(model="llama3.1:latest")

prompt = ChatPromptTemplate.from_messages([
    ("system",  "You are a vocabulary tutor. The user is learning the word '{word}'."
     "They have written a sentence using this word."
     "Check is the sentence uses the word correctly."
     "Reply with: only CORRECT if correct or if incorrect then a brief explanation if incorrect."),
    ("human", "{sentence}")
])

chain = prompt | llm

#Backend
class ValidationReq(BaseModel):
    word: str
    sentence: str

app = FastAPI()

@app.post("/validate")
def validate(request: ValidationReq):
    response = chain.invoke({
        "word": request.word,
        "sentence": request.sentence
    })
    return {"result": response.content}