package com.payroll.payroll.service;

import com.payroll.payroll.util.colombianHolidayUtil;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class payrollService {

    private boolean isBusinessDay(LocalDate date) {
        return !(date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                date.getDayOfWeek() == DayOfWeek.SUNDAY ||
                colombianHolidayUtil.isHoliday(date));
    }

    public LocalDate getNextPayrollDate(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();

        LocalDate fifteenth = LocalDate.of(year, month, 15);

        // Evitar excepción en meses con menos de 30 días
        int lastDay = date.lengthOfMonth();
        LocalDate secondPaymentDay = LocalDate.of(year, month, Math.min(30, lastDay));

        LocalDate nextPayroll;
        if (date.isBefore(fifteenth) || date.equals(fifteenth)) {
            nextPayroll = fifteenth;
        } else if (date.isBefore(secondPaymentDay) || date.equals(secondPaymentDay)) {
            nextPayroll = secondPaymentDay;
        } else {
            // Avanzar al mes siguiente
            LocalDate nextMonth = date.plusMonths(1);
            int nextMonthLastDay = nextMonth.lengthOfMonth();
            nextPayroll = LocalDate.of(nextMonth.getYear(), nextMonth.getMonth(), 15);
        }

        // Ajustar al día hábil anterior si cae en festivo o fin de semana
        while (!isBusinessDay(nextPayroll)) {
            nextPayroll = nextPayroll.minusDays(1);
        }

        return nextPayroll;
    }

}