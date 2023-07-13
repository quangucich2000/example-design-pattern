public class Main {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("https://www.thoughtco.com/thmb/tB87Y0Ko5MIq99OkebSjWWhe8yo=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-914450516-5a831486642dca0037213a33.jpg");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}