public interface Subject {
    void susbcribe(Observer obj);
    void unsusbcribe(Observer obj);
    void newVideoUploaded(String title);
}

