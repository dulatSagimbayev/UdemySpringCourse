package springframework.first.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.first.domain.Author;
import springframework.first.domain.Book;
import springframework.first.domain.Publisher;
import springframework.first.repositories.AuthorRepository;
import springframework.first.repositories.BookRepository;
import springframework.first.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository  authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setName("DS Publishing");
        publisher.setCity("Almaty");

        publisherRepository.save(publisher);


        Author dulat = new Author("Dulat","Sagimbayev");
        Book someBook  = new Book("Harry Potter","1233321");
        dulat.getBooks().add(someBook);
        someBook.getAuthors().add(dulat);

        authorRepository.save(dulat);
        bookRepository.save(someBook);

        Author eric = new Author("Eric","Johnson");
        Book lord  = new Book("Lord of the rings","12333334444");
        eric.getBooks().add(lord);
        lord.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(lord);

        System.out.println("Starting with BootStrap...");
        System.out.println("Number of books: "+bookRepository.count());
        System.out.println("Number of publisher: "+publisherRepository.count());

    }
}
