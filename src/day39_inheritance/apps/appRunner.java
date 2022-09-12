package day39_inheritance.apps;

public class appRunner {
    public static void main(String[] args) {
        Instagram insta1 = new Instagram("Instagram",13.4);
        insta1.download();
        insta1.postPicture();

        //insta1.watchVideo  We can not access to the youtube class's method.

        youTube youTube1 = new youTube( 15.2);
        System.out.println(youTube1.version);
        System.out.println(youTube1.name);
        youTube1.download();
        youTube1.watchVideo();

        //youTube1.postPicture-> W can not access to the youtube class's method.
    }
}
