package myservice
import data.Content ;
import mydom.User;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils; 
import mydom.News;
import mydom.Comment;


class InsertdataService {
    static transactional = false;
    
    def insertNews(params) {
        
        //println params;
        //def ne= new News(annotation :'anmmn' , image_name : "imageName").save();
        //println ne.errors.allErrors()
        String json = params.name;
        
        Gson g = new Gson();
        Content cn  = new Content();
        cn= g.fromJson(json, Content.class);
          
        //println  cn.getNews() ;
        //println  cn.getPictur() ;
        def anno = cn.getNews();
        
        
        
        try
        {
            def b = cn.getPictur().toList() as byte[]
            def date=new Date();
            def imageName = ""+date;
            imageName=imageName.replace(" ","_");
            imageName=imageName.replace(":","-");
            imageName+=".jpg";
            def file =new File("""./web-app/images/news/${imageName}""").withOutputStream {
                it.write b
            }
            this.inseretdata(anno,imageName);
        }
        catch(Exception ex)
        {
            
        }
        /*  news.annotation = cn.getNews();
          news.date = new Date();
        
          news.image_name = imageName;
          //news.image_data =cn.getPictur();
          */
          //news.save();
         // println news.errors.allErrors()
          

    }
    def inseretdata (def anno, def imagName) {
        def ne= new News(annotation : anno , image_name : imagName ).save();     
    }
    
    def insertComment(def comment, int newsId)
    {
        def news = News.findById(newsId);
        new Comment(comment_details : comment, news : news).save();
    }
  
}
