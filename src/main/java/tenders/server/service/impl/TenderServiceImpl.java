package tenders.server.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tenders.server.dto.ChangeFavouriteTenderDto;
import tenders.server.dto.TenderDto;
import tenders.server.mapper.TenderMapper;
import tenders.server.model.Tender;
import tenders.server.repository.TenderRepository;
import tenders.server.service.TenderService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TenderServiceImpl implements TenderService {
  private final TenderMapper tenderMapper;
  private final TenderRepository tenderRepository;

  @Override
  public List<TenderDto> getTenders() {
    return tenderMapper.toDtoList(tenderRepository.findAll());
  }

  @Override
  public TenderDto getExactTender(String id) {
    return tenderMapper.toDto(tenderRepository.findById(id)
      .orElseThrow(() -> new RuntimeException("Не найден экземлпяр тендера с id = " + id)));
  }

  @Override
  public List<TenderDto> getFavouriteTenders() {
    return tenderMapper.toDtoList(tenderRepository.findAllByFavouriteIsTrue());
  }

  @Override
  public TenderDto changeFavouriteTender(ChangeFavouriteTenderDto changeFavouriteTenderDto) {
    Tender tender = tenderRepository.findById(changeFavouriteTenderDto.getId())
      .orElseThrow(() -> new RuntimeException("Не найден экземлпяр тендера с id = " + changeFavouriteTenderDto.getId()));
    tender.setFavourite(changeFavouriteTenderDto.isFavourite());

    return tenderMapper.toDto(tenderRepository.save(tender));
  }
}
