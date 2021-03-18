package io.github.olgazskiba.Java_blog.hw_lecture3.collections;

import io.github.olgazskiba.Java_blog.hw_lecture3.operators.SignComparator;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;
/*Необходимо разработать класс UniqueWordVocabulary, который реализует следующие методы:

        void addWord(String word) - добавить строку в коллекцию;

        Ограничения: слова - дубликаты и пустые слова добавляться в коллекцию не должны;
        int getWordsCount() - возвращает количество уникальных слов в коллекции;

        void printVocabulary() - должен распечатать в консоли содержимое коллекции;

        В качестве базовой коллекции нужно использовать Set.*/

public class UniqueWordVocabulary {

    public Logger log = Logger.getLogger(SignComparator.class);

    public Set<String> vocabulary = new HashSet<>();

    public void addWord(String word) {
        if (!(word == null) && !(vocabulary.contains(word))) {
            vocabulary.add(word);
        }
    }
    public int getWordsCount(){
        return vocabulary.size();
}

   public void printVocabulary(){
     log.info(vocabulary);
    }


}
