package mycon
import data.Content ;
import mydom.User;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils; 
import myservice.InsertdataService ;
import myservice.GetdataService;
import mydom.News;

class NewsController {
    
    def insertdataService = new InsertdataService();
    def getdataService = new GetdataService();
    
    def index() { }
   
    def isesrtnews() {
        insertdataService.insertNews(params);
    }
    def recieve(){  
         def newsIntance;
         newsIntance = getdataService.getNewsData();
         def imageDir = "images/news";
        [newsIntance: newsIntance , imageDir : imageDir]
    }
    def details(){
        def newsIntance;
        def commentIntance;
        def newsId = Integer.parseInt(params.newsid);
        newsIntance = getdataService.getDetailsNews(params);
        commentIntance = getdataService.getCommnet(newsId);
        def imageDir = "images/news";
        [newsdetails: newsIntance, , imageDir : imageDir, commentIntance : commentIntance];
    }
}
