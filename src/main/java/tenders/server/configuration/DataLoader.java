package tenders.server.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import tenders.server.repository.TenderRepository;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {
  private final TenderRepository tenderRepository;

  public void run(ApplicationArguments args) {
    tenderRepository.saveAll(InitialData.TENDERS);
  }
}
