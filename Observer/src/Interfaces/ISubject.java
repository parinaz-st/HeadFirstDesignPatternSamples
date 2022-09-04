package Interfaces;

public interface ISubject {
    public void registerObserver(IObserver observer);
   public void removeObserver(IObserver observer);
    void notifyObserver();
}
