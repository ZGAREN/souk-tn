package tn.souk.api.listing;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** Annexe "véhicule" : table vehicle_listings, même id que dans listings. */
@Entity
@Table(name = "vehicle_listings")
@DiscriminatorValue("VEHICLE")
@PrimaryKeyJoinColumn(name = "listing_id")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class VehicleListing extends Listing {

    @Column(nullable = false, length = 50)
    private String brand;

    @Column(nullable = false, length = 50)
    private String model;

    @Column(name = "model_year", nullable = false)
    private Integer modelYear;

    @Column(name = "mileage_km", nullable = false)
    private Integer mileageKm;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private FuelType fuel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Gearbox gearbox;
}
