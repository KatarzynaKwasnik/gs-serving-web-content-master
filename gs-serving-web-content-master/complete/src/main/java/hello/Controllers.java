package hello;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //zwraca bez body
public class Controllers {
    private RetrievingBooks a = new RetrievingBooks();
    //private String allRows = a.getAllRows();

/*
    @RequestMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
       // model.addAttribute("name", name);
        return "greeting";
    }
*/

    @RequestMapping(value = "/getAllRows", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRows(Model model) {
        String allRows=a.getAllRows();
      //  model.addAttribute("message", allRows);
        return allRows;
    }

    @RequestMapping(value = "/getAllRowsSortedByTitleAsc", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRowsSortedByTitleAsc(Model model) {
        String allRows=a.getAllRowsSortedByTitleAsc();
        //  model.addAttribute("message", allRows);
        return allRows;
    }

    @RequestMapping(value = "/getAllRowsSortedByTitleDesc", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRowsSortedByTitleDesc(Model model) {
        String allRows=a.getAllRowsSortedByTitleDesc();
        //  model.addAttribute("message", allRows);
        return allRows;
    }

    @RequestMapping(value = "/getAllRowsSortedByAuthorAsc", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRowsSortedByAuthorAsc(Model model) {
        String allRows=a.getAllRowsSortedByAuthorAsc();
        //  model.addAttribute("message", allRows);
        return allRows;
    }

    @RequestMapping(value = "/getAllRowsSortedByAuthorDesc", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRowsSortedByAuthorDesc(Model model) {
        String allRows=a.getAllRowsSortedByAuthorDesc();
        //  model.addAttribute("message", allRows);
        return allRows;
    }

    @RequestMapping(value = "/getRowsSelectByAuthor", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRowsSelectByAuthor(@RequestParam(value="str", required=false, defaultValue="") String str, Model model) {
        String allRows=a.getRowsSelectByAuthor(str);
        //  model.addAttribute("message", allRows);
        return allRows;
    }

    @RequestMapping(value = "/getRowsSelectByTitle", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRowsSelectByTitle(@RequestParam(value="str", required=false, defaultValue="") String str, Model model) {
        String allRows=a.getRowsSelectByTitle(str);
        //  model.addAttribute("message", allRows);
        return allRows;
    }







}
