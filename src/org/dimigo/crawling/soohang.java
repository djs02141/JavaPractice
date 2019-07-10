package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class soohang {

    public static void main(String[] args) {
        List<String> movtitle  = new ArrayList<>();

        try {

            Document doc = Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
//            System.out.println(doc.html());
            //class="rank" => .select("rank")
            Elements result = doc.select(".r_ranking").select("a");
            movtitle = result.eachText();


            int i=0;
            for (String genre : movtitle
            ) {
                System.out.printf("%d위 %s\n",++i,genre.substring(2));
                if (i%5==0) {
                    i = 0;
                    System.out.println();
                }
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
