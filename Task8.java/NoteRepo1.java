package Task8.java;

@Repository
public class NoteRepo1 {
    public interface NoteRepo extends JpaRepository<Note, Long> {

        /**
         * Найти заметку по id
         * @param id must not be {@literal null}.
         * @return возвращает заметку.
         */
        Optional<Note> findById(Long id);
}
