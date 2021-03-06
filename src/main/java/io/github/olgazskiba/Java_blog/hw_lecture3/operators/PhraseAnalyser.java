package io.github.olgazskiba.Java_blog.hw_lecture3.operators;
/*Программа должна анализировать текст и возвращать его описание в соответствии со следующими правилами:

"It stands no chance", если строка начинается со слов "Make" и заканчивается на "great again";
"It could be worse", если строка начинается со слов "Make" или заканчивается на "great again";
"It is fine, really", если строка не подходит под критерии выше;
 */

import org.apache.log4j.Logger;

public class PhraseAnalyser {

    public Logger log = Logger.getLogger(PhraseAnalyser.class);

    public String analyse(String text) {

        if (text.startsWith("Make") &&  text.endsWith("great again")){
            return "It stands no chance";
        }
        else if (text.startsWith("Make") || text.endsWith("great again")){
            return "It could be worse";
        }
        else {
            return "It is fine, really";
        }
    }
}
