public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Джек", "Лондон");
        Author author2 = new Author("Александр", "Дюма");

        // Создаем книги
        Book book1 = new Book("Лютый зверь", author1, 1913);
        Book book2 = new Book("Граф Монте-Кристо", author2, 1844);

        // Выводим информацию о книгах
        System.out.println("Книга 1: " + book1.getTitle() +
                ", автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", год: " + book1.getPublicationYear());

        System.out.println("Книга 2: " + book2.getTitle() +
                ", автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", год: " + book2.getPublicationYear());

        // Изменяем год публикации одной из книг
        book2.setPublicationYear(1846);
        System.out.println("Обновленный год публикации для " + book2.getTitle()  + ": " + book2.getPublicationYear());

    }
}