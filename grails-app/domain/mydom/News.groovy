package mydom
class News {

    Integer id ;
    String annotation ;
    String details ;
    String image_name ;
    // byte[] image_data ;
    Integer liked ;
    Date date = new Date();
    
    static hasMany = [comment  : Comment , category : Category]
    
    static constraints  = {
        
        details( blank: true, nullable: true, maxSize : 255) 
        
        image_name (blank:true, nullable: true) 
        comment (blank: true, nullable: true)
        category (blank: true, nullable: true)
        annotation (blank:true, nullable: true)
        
        liked ( blank : true, nullable: true) 
    }
     //   static mapping = {
     //   image_data column:'image_dat', sqltype:'blob'
   // }
   static void newsinit()
   {
       if(News.count()==0)
            def ne = new News(annotation :'ICPC 2012' , image_name : 'MIST.jpg', details: 'It is a great news that, one of the MIST programming contest teams MIST_Kernel  achieved 17th position in team ranking 9th. CONGRATULATION!').save(); 
            
   }
   static void savedata(def anno, def imagName)
   {
       def ne= new News(annotation : anno , image_name : imagName ).save(); 
   }
     
}
