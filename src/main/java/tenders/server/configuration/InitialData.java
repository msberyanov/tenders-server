package tenders.server.configuration;

import tenders.server.model.Tender;

import java.util.ArrayList;
import java.util.List;

public class InitialData {
  public static List<Tender> TENDERS;

  static {
    TENDERS = new ArrayList<>();

    TENDERS.add(Tender.builder()
      .name("Выполнение работ по техническому перевооружению вагонного депо электродепо Невское в части системы контроля загазованности")
      .description("№64333273")
      .expiration("09.12.2022 15:00")
      .price("12 666 553")
      .favourite(true)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Проведение работ по текущему ремонту скважины ЭУВ6-10-140")
      .description("№64332367")
      .expiration("05.12.2022 09:00")
      .price("400 687")
      .favourite(true)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Обслуживание УЭЦН малого габарита и возмездной передаче УЭЦН во временное пользование")
      .description("№64326086")
      .expiration("01.12.2022 00:00")
      .price("–")
      .favourite(true)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Оказание услуг по зачистке оборудования на объектах АО Тюменнефтегаз")
      .description("№64323018")
      .expiration("12.12.2022 15:00")
      .price("–")
      .favourite(true)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Оказание услуг по ремонту насосно-компрессорных труб (НКТ) с заменой муфт")
      .description("№64323008")
      .expiration("08.12.2022 15:00")
      .price("–")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Ремонт существующего футеровочного покрытия аппаратов реакторного блока цеха № 01 ЗБ и строительно-монтажные работы")
      .description("№64322634")
      .expiration("10.01.2023 12:00")
      .price("20 812 575")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Комплекс работ по техническому и аварийному обслуживанию газового оборудования в котельных")
      .description("№64317168")
      .expiration("12.12.2022 16:00")
      .price("645 463")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Капитальный ремонт оборудования для подъёмных агрегатов АПР-80")
      .description("№64315770")
      .expiration("07.12.2022 14:00")
      .price("–")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Поставка шламоуловителя колонного ШМУ-114")
      .description("№64315658")
      .expiration("06.12.2022 12:00")
      .price("–")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Приобретение запасных частей для ПСТ СБУ")
      .description("№64333969")
      .expiration("01.12.2022 18:34")
      .price("–")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Запасные части ПСТ СБУ 2023")
      .description("№64333973")
      .expiration("01.12.2022 19:12")
      .price("–")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Буровые укрытия, тенты, пологи")
      .description("№64311826")
      .expiration("05.12.2022 18:59")
      .price("–")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Выполнение работ по капитальному ремонту блока маслохозяйства на объектах ООО Газпром трансгаз Уфа в 2022 году")
      .description("№64327403")
      .expiration("02.12.2022 10:00")
      .price("4 811 520")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Выполнение работ по строительству эксплуатационных скважин на кустовой площадке № 32 Унтыгейского месторождения")
      .description("№64330614")
      .expiration("12.12.2022 00:00")
      .price("24 259 108")
      .favourite(false)
      .build()
    );

    TENDERS.add(Tender.builder()
      .name("Оказание услуг по обеспечению оборудованием системы верхнего привода с техническим сопровождением при строительстве скважин")
      .description("№64328194")
      .expiration("07.12.2022 16:00")
      .price("51 222 272")
      .favourite(false)
      .build()
    );
  }
}
