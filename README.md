<h1>Как работает программа</h1>

В методе main класса Main() создается объект класса
SalesManager(), куда передается интовый одномерный
массив:

     int[] analytics = {5, 4, 7, 9, 14};
     SalesManager salesManager = new SalesManager(analytics);

У класса SalesManager() есть метод max(), который
из массива переданного в конструктор выбирает
самое большое значение и возвращает его:

     public int max() {
         int max = -1;
         for (int sale : sales) {
             if (sale > max) {
                 max = sale;
             }
         }
         return max;
      }