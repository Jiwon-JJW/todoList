package todoList.service;

import org.springframework.stereotype.Service;
import todoList.repository.CardRepository;

@Service
public class CardService {
    CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }
}
