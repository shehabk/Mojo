import mydom.User ;
import mydom.News;

class BootStrap {

    def init = { servletContext ->
        News.newsinit();
    }
    def destroy = {
    }
}
