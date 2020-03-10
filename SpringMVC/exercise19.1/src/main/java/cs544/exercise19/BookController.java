package cs544.exercise19;

import cs544.sample.NoSuchResourceException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class BookController {
    @Resource
    private IBookDao bookDao;

    @RequestMapping("/books")
    public String redirectRoot(){
        return "redirect:/books";
    }

    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public String getAll(Model model){
        model.addAttribute("books", bookDao.getAll());
        return "bookList";
    }

    @RequestMapping(value = "/books",method = RequestMethod.POST)
    public String addBook(Book book){
        bookDao.add(book);
        return "redirect:/books";
    }

    @RequestMapping(value = "/book/{id}",method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model){
        model.addAttribute("book",bookDao.get(id));
        return "bookDetail";
    }

    @RequestMapping(value = "/book/{id}",method= RequestMethod.POST)
    public String update(Book book,@PathVariable int id){
        bookDao.update(id,book);
        return "redirect:/books";
    }

    @RequestMapping(value = "/book/delete",method = RequestMethod.POST)
    public String delete(int bookId){
        bookDao.delete(bookId);
        return "redirect:/books";
    }
   @ExceptionHandler(value = NoSuchResourceException.class)
        public ModelAndView handle(Exception e){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.getModel().put("e",e);
            modelAndView.setViewName("NoSuchResource");
            return  modelAndView;
       }
}
