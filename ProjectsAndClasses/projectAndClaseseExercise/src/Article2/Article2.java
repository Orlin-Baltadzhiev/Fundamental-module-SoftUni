package Article2;

public class Article2 {
    private String title;
    private String content;
    private String author;

    public Article2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }



    @Override
    public String toString(){
        String result =String.format("%s - %s: %s", this.title,this.content,this.author);
        return result;
    }


}
