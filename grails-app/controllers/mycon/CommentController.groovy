package mycon
import data.Content ;
import mydom.User;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils; 
import myservice.InsertdataService ;
import myservice.GetdataService;
import mydom.News;

class CommentController {
    
    def insertdataService = new InsertdataService();
    def getdataService = new GetdataService();

    def savecomment()
    {
        def comment = params.comment;
        def newsId = Integer.parseInt(params.newsId);
        insertdataService.insertComment(comment, newsId);
    }
}
