//package io.github.gautamKodes.vocabulary_webapp.config;
//
//
//// @Component: So the spring boot creates an instance of
//// this on startup and extending commandlinerunner
//// so that the 'run' func is automatically executed,
//// hence executing the data seeding process automatically as a whole
//
//import io.github.gautamKodes.vocabulary_webapp.users.User;
//import io.github.gautamKodes.vocabulary_webapp.users.UserRepository;
//import io.github.gautamKodes.vocabulary_webapp.words.Word;
//import io.github.gautamKodes.vocabulary_webapp.words.WordsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DatabaseSeeder implements CommandLineRunner {
//    private final UserRepository userRepository;
//    private final WordsRepository wordsRepository;
//
//    @Autowired
//    public DatabaseSeeder(WordsRepository wordsRepository, UserRepository userRepository){
//        this.wordsRepository = wordsRepository;
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception{
//
//        if(wordsRepository.count()==0){
//            wordsRepository.save(new Word("Meticulous", "adjective", "Showing great attention to detail; very careful and precise.", "Showing great attention to detail; very careful and precise."));
//            wordsRepository.save(new Word("Ephemeral", "adjective", "Lasting for a very short time.", "Lasting for a very short time."));
//            wordsRepository.save(new Word("Obfuscate", "verb", "Render obscure, unclear, or unintelligible.", "Render obscure, unclear, or unintelligible."));
//            System.out.println("Database seeded with words");
//        }
//
//        if (userRepository.count() == 0) {
//            userRepository.save(new User("gautam@example.com", "gautamKodes", "local", "dev-user-id"));
//            System.out.println("Database seeded with user");
//        }
//    }
//}
