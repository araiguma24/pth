package jp.co.stylez.pth.web.controller;

@Controller
public class IndexController {

	@RequestMapping("/")
	public string index(Model model) {
		return "index";
	}
}
