package com.zcj.com.zcj.pachong;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class jsoupTest {
    public static void main(String[] args) throws IOException {
        //获取编辑推荐页
        Document document = Jsoup.connect("https://www.80s.tw/ju/12462")
                //模拟火狐浏览器
                .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
                .get();
//        Elements body = document.select("img[src~=(?i)\\.(png|jpe?g)]");//图片
//        Elements url = main.select("div").select("div:nth-child(2)")
//                .select("h2").select("a[class=question_link]");
//        Elements url = main.select("div").select("a[href]");
//        System.out.println(url.toString());
//        byte[] bytes = div.toString().getBytes();
        Element zoom = document.getElementById("cpdl2list");
        Elements div = zoom.select("div").select("a[href]");
        OutputStream o = new FileOutputStream(new File("C:\\Users\\Mrs.ChongJie\\Desktop\\爱情回来了.txt"));
//        for (Element t : div) {
//            System.out.println(t.attr("href"));
//            byte[] hrefs = t.attr("href").toString().getBytes();
//            o.write(hrefs);
//        }
        o.write(div.toString().getBytes());
//        byte[] bytes = div.toString().getBytes();


        // OutputStream out = new FileOutputStream(new File("C:\\Users\\Mrs.ChongJie\\Desktop\\爱奇艺.txt"));
//        out.write(bytes);
//        for (Element question : url) {
//            //输出href后的值，即主页上每个关注问题的链接
//            String URL = question.attr("abs:href");
//            //下载问题链接指向的页面
//            Document document2 = Jsoup.connect(URL)
//                    .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
//                    .get();
//            //问题
//            Elements title = document2.select("#zh-question-title").select("h2").select("a");
//            //问题描述
//            Elements detail = document2.select("#zh-question-detail");
//            //回答
//            Elements answer = document2.select("#zh-question-answer-wrap")
//                    .select("div.zm-item-rich-text.expandable.js-collapse-body")
//                    .select("div.zm-editable-content.clearfix");
//            System.out.println("\n" + "链接：" + URL
//                    + "\n" + "标题：" + title.text()
//                    + "\n" + "问题描述：" + detail.text()
//                    + "\n" + "回答：" + answer.text());
//        }
    }
}
