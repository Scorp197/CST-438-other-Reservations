package cst438.domain;

public class UserDepartureDate {

   private String format;
   private boolean autoclose;
   private boolean todayHighlight;
   private boolean selectOtherMonths;
   private boolean showOtherMonths;
   private boolean changeMonth;
   private boolean changeYear;
   private String orientation;

   public UserDepartureDate(String format) {
      new UserDepartureDate(format);

   }


   public UserDepartureDate(String format, boolean autoclose, boolean todayHighlight,
      boolean selectOtherMonths, boolean showOtherMonths, boolean changeMonth, boolean changeYear, String orientation)
   {
      this.format = "yyyy-mm-dd";
      this.autoclose = true;
      this.todayHighlight = true;
      this.showOtherMonths = true;
      this.selectOtherMonths = true;
      this.autoclose = true;
      this.changeMonth = true;
      this.changeYear = true;
      this.orientation = "button";
   }
}