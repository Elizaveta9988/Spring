package Task8.java;

@Data
@Entity
@NoArgsConstructor
public class Note1 {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

}

