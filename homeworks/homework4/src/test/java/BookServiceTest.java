package book;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class BookServiceTest {

    @Test
    public void testGetBookById() {
        InMemoryBookRepository mockBookRepository = mock(InMemoryBookRepository.class);
        BookService mockBookService = new BookService(mockBookRepository);
        Book someBookId1 = new Book("1", "Book1", "Author1");
        when(mockBookRepository.findById("1")).thenReturn(someBookId1);
        assertThat(mockBookService.findBookById("1")).isEqualTo(someBookId1);
        verify(mockBookRepository, times(1)).findById("1");
    }

    @Test
    public void testGetAllBooks() {
        InMemoryBookRepository mockBookRepository = mock(InMemoryBookRepository.class);
        BookService mockBookService = new BookService(mockBookRepository);
        Book someBookId1 = new Book("1", "Book1", "Author1");
        ArrayList<Book> someBooks = new ArrayList<Book>();
        someBooks.add(someBookId1);
        when(mockBookRepository.findAll()).thenReturn(someBooks);
        assertThat(mockBookService.findAllBooks()).isEqualTo(someBooks);
        verify(mockBookRepository, times(1)).findAll();
    }
}
