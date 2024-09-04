package com.example.tp2_ddd.domain;
import java.time.LocalDateTime;

public abstract class DominioEvent {

    private final LocalDateTime dataHora;

    protected DominioEvent() {
        this.dataHora = LocalDateTime.now();
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "EventoDominio{" +
                "dataHora=" + dataHora +
                '}';
    }
}
