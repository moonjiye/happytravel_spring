package kr.happytravel.erp.mypage.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttendanceManagementModel {
    private String empId;   // EMP_ID
    private String attendanceTypeCode; // ATTENDANCE_TYPE_CODE
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
    private Date startDate; // START_DATE
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
    private Date endDate; // END_DATE
    private String assignCode; // ASSIGN_CODE
    private String reason; // REASON
    private String title; // TITLE
    private String attendanceTypeName; // ATTENDANCE_TYPE_NAME
    private String assignName; // ASSIGN_NAME
}
