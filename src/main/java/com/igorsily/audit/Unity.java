package com.igorsily.audit;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Getter
@Setter
@Builder
@Entity
@Table(name = "unities")
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Unity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    private Double areaTotal;

    private Double areaPrincipal;

    private Boolean ativado;
}
