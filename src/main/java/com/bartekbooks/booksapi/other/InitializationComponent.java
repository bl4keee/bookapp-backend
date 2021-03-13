package com.bartekbooks.booksapi.other;

import com.bartekbooks.booksapi.model.Book;
import com.bartekbooks.booksapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitializationComponent {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    private void init() {

        bookRepository.deleteAll();

        Book book = new Book();
        book.setTitle("Harry Potter and the Order of the Phoenix");
        book.setAuthor("J.K. Rowling");
        book.setDescription("Harry Potter and the Order of the Phoenix is a fantasy novel written by British author J. K. Rowling and the fifth novel in the Harry Potter series. It follows Harry Potter's struggles through his fifth year at Hogwarts School of Witchcraft and Wizardry.");
        book.setImgUrl("hpphoenix.jpg");
        book.setPrice(10.00);
        book.setCode("#ppp1312wdfb33");
        bookRepository.save(book);

        book = new Book();
        book.setTitle("Pride and Prejudice");
        book.setAuthor("Jane Austen");
        book.setDescription("Pride and Prejudice is an 1813 romantic novel of manners written by Jane Austen. The novel follows the character development of Elizabeth Bennet, the dynamic protagonist of the book who learns about the repercussions of hasty judgments and comes to appreciate the difference between superficial goodness and actual goodness.");
        book.setImgUrl("prideandprejudice.jpg");
        book.setPrice(13.50);
        book.setCode("#ppp11413wdfb34");
        bookRepository.save(book);

        book = new Book();
        book.setTitle("12 Rules for Life");
        book.setAuthor("Jordan Peterson");
        book.setDescription("12 Rules for Life: An Antidote to Chaos is a 2018 self-help book by Canadian clinical psychologist and psychology professor Jordan Peterson. It provides life advice through essays in abstract ethical principles, psychology, mythology, religion, and personal anecdotes.");
        book.setImgUrl("rulesforlife.jpg");
        book.setPrice(14.75);
        book.setCode("#ppp1515dsf63");
        bookRepository.save(book);

    }
}
