public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    
    // notifies all the observers:
    public void notifyObservers();
}
