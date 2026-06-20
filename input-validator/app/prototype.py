import os
# from dotenv import load_dotenv
# from pathlib import Path
# from langchain_openai import ChatOpenAI
# from langchain_core.prompts import ChatPromptTemplate
# from langchain_google_genai import ChatGoogleGenerativeAI
from langchain_core.prompts import ChatPromptTemplate
from langchain_ollama import ChatOllama

# load_dotenv(dotenv_path=Path(__file__).parent.parent / ".env")

# llm = ChatOpenAI(
#     model="openrouter/fusion",  # Any free model on OpenRouter
#     openai_api_key=os.getenv("OPENROUTER_API_KEY"),
#     openai_api_base="https://openrouter.ai/api/v1",
# )
llm = ChatOllama(model="llama3.1:latest")

prompt = ChatPromptTemplate.from_messages([
    ("system",  "You are a vocabulary tutor. The user is learning the word '{word}'."
     "They have written a sentence using this word."
     "Check is the sentence uses the word correctly."
     "Reply with: CORRECT or INCORRECT, followed by a brief explanation if incorrect."),
    ("human", "{sentence}")
])

chain = prompt | llm

word = "Hard"
sentence = "We are walking hard to hard"

response = chain.invoke({"word": word, "sentence": sentence})
print(response.content)