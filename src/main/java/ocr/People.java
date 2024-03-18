package ocr;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@ToString
@Data
public class People implements Serializable {
        private String idCard;
        private String name;
        private String sex;
        private String address;
        private String nation;
        private LocalDate birthday;


}
