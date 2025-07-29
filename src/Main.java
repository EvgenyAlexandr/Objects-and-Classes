public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Джек", "Лондон");
        Author author2 = new Author("Александр", "Дюма");

        // Создаем книги
        Book book1 = new Book("Лютый зверь", author1, 1913);
        Book book2 = new Book("Граф Монте-Кристо", author2, 1844);

        // Выводим информацию о книгах
        System.out.println(book1);
        System.out.println(book2);

        // Сравниваем объекты.
        System.out.println();
        System.out.println("Это тот-же автор? " + author1.equals(new Author("Джек", "Лондон")));
        System.out.println("Это та-же Книга? " + book1.equals(new Book("Лютый зверь", author1, 1913)));
    }
}