package com.tup.buensabor.dtos.ranking;

import java.math.BigDecimal;
// Proyeccion Interfaz cerrada sin el uso de Mapstruc
public interface ArticuloManufacturadoRankingDto {
    String getDenominacion();
    Long getCantidadVendida();
    BigDecimal getCosto();
    BigDecimal getPrecioVenta();
    BigDecimal getCostoTotal();
    BigDecimal getVentaTotal();
    BigDecimal getUtilidadTotal();
}
