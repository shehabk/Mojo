package mydom

class Comment {

    Integer id ;
    Date date = new Date();
    String comment_details ;
    
    
    static belongsTo   =  [ news : News ]
    
    static constraints = {
        
    }
}
