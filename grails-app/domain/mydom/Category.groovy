package mydom

class Category {

    Integer id ;
    String category_name ;
    
    static hasOne = [ news : News ] ;
    
    static constraints = {
        
    }
}
