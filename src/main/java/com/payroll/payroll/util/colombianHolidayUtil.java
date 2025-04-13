package com.payroll.payroll.util;

import java.time.LocalDate;
import java.util.Set;

public class colombianHolidayUtil {

    private static final Set<LocalDate> HOLIDAYS = Set.of(

            //2023
            LocalDate.of(2023, 1, 1),   // Año Nuevo
            LocalDate.of(2023, 1, 9),   // Reyes Magos (trasladado)
            LocalDate.of(2023, 3, 20),  // San José (trasladado)
            LocalDate.of(2023, 4, 6),   // Jueves Santo
            LocalDate.of(2023, 4, 7),   // Viernes Santo
            LocalDate.of(2023, 5, 1),   // Día del Trabajo
            LocalDate.of(2023, 5, 22),  // Ascensión (trasladado)
            LocalDate.of(2023, 6, 12),  // Corpus Christi (trasladado)
            LocalDate.of(2023, 6, 19),  // Sagrado Corazón (trasladado)
            LocalDate.of(2023, 7, 3),   // San Pedro y San Pablo (trasladado)
            LocalDate.of(2023, 7, 20),  // Independencia
            LocalDate.of(2023, 8, 7),   // Batalla de BoyacáLocalDate.of(2023, 8, 21) ,  // Asunción (trasladado)
            LocalDate.of(2023, 10, 16), // Día de la Raza (trasladado)
            LocalDate.of(2023, 11, 6),  // Todos los Santos (trasladado)
            LocalDate.of(2023, 11, 13), // Independencia de Cartagena (trasladado)
            LocalDate.of(2023, 12, 8),  // Inmaculada Concepción
            LocalDate.of(2023, 12, 25),  // Navidad

            //2024
            LocalDate.of(2024, 1, 1),    // Año Nuevo
            LocalDate.of(2024, 1, 8),    // Reyes Magos (trasladado)
            LocalDate.of(2024, 3, 25),   // Día de San José (trasladado)
            LocalDate.of(2024, 3, 28),   // Jueves Santo
            LocalDate.of(2024, 3, 29),   // Viernes Santo
            LocalDate.of(2024, 5, 1),    // Día del Trabajo
            LocalDate.of(2024, 5, 13),   // Ascensión del Señor (trasladado)
            LocalDate.of(2024, 6, 3),    // Corpus Christi (trasladado)
            LocalDate.of(2024, 6, 10),   // Sagrado Corazón (trasladado)
            LocalDate.of(2024, 7, 1),    // San Pedro y San Pablo (trasladado)
            LocalDate.of(2024, 7, 20),   // Día de la Independencia
            LocalDate.of(2024, 8, 7),    // Batalla de Boyacá
            LocalDate.of(2024, 8, 19),   // La Asunción (trasladado)
            LocalDate.of(2024, 10, 14),  // Día de la Raza (trasladado)
            LocalDate.of(2024, 11, 4),   // Todos los Santos (trasladado)
            LocalDate.of(2024, 11, 11),  // Independencia de Cartagena (trasladado)
            LocalDate.of(2024, 12, 8),   // Inmaculada Concepción
            LocalDate.of(2024, 12, 25),  // Navidad

            //2025
            LocalDate.of(2025, 1, 1),    // Año Nuevo
            LocalDate.of(2025, 1, 6),    // Reyes Magos (trasladado)
            LocalDate.of(2025, 3, 24),   // Día de San José (trasladado)
            LocalDate.of(2025, 4, 17),   // Jueves Santo
            LocalDate.of(2025, 4, 18),   // Viernes Santo
            LocalDate.of(2025, 5, 1),    // Día del Trabajo
            LocalDate.of(2025, 6, 2),    // Ascensión del Señor (trasladado)
            LocalDate.of(2025, 6, 23),   // Corpus Christi (trasladado)
            LocalDate.of(2025, 6, 30),   // Sagrado Corazón (trasladado)
            LocalDate.of(2025, 7, 20),   // Día de la Independencia
            LocalDate.of(2025, 8, 7),    // Batalla de Boyacá
            LocalDate.of(2025, 8, 18),   // La Asunción (trasladado)
            LocalDate.of(2025, 10, 13),  // Día de la Raza (trasladado)
            LocalDate.of(2025, 11, 3),   // Todos los Santos (trasladado)
            LocalDate.of(2025, 11, 10),  // Independencia de Cartagena (trasladado)
            LocalDate.of(2025, 12, 8),   // Inmaculada Concepción
            LocalDate.of(2025, 12, 25)  // Navidad

    );

    public static boolean isHoliday(LocalDate date) {
        return HOLIDAYS.contains(date);
    }
}

