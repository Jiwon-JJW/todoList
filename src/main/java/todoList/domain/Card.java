package todoList.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private boolean status;

    @ManyToOne
    @JoinColumn("category_id")
    private Category category;

    public Card(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = true;
    }

    public void statusDone() {
        status = false;
    }

    public void statusOpen() {
        status = true;
    }
}
