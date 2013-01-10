package myservice
import mydom.News;
import mydom.Comment;

class GetdataService {
    
     def getNewsData()
   {
       def j = News.list(sort: 'date', order: 'desc', max: 5);
       return j;
   }
   def getDetailsNews(def params)
   {
       def queryMap = [:];
       queryMap["id"] = Integer.parseInt(params.newsid);
       return this.getDetails(queryMap);
   }
   def getDetails(def queryMap)
   {
       def newsdetails = News.findWhere(queryMap);
       return newsdetails;
   }
   def getCommnet(int newsId){
       def news = News.findById(newsId);
       def comment = Comment.list(news : news);
       return comment;
   }
}
