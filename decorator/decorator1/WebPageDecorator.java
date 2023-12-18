public class WebPageDecorator implements WebPage {
    protected WebPage page;

    public WebPageDecorator(WebPage webPage) {
        this.page = webPage;
    }
    @Override
    public void display() {
        this.page.display();
    }
    
}
