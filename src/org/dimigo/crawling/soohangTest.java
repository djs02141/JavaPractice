//package org.dimigo.crawling;
//
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//
//import java.net.URLEncoder;
//import java.util.List;
//
//public class soohangTest {
//    public static void main(String[] args) {
//
//        try{
//
//            Document doc = Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rpeople.nhn").get();
//
//            Elements result = doc.select("tr").select("a");
//            List<String> list = result.eachText();
//
//            int j=0;
//            for (String actor : list
//            ) {
//                System.out.printf("%d.%s\n",++j,actor);
//            }
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//
//}
//
