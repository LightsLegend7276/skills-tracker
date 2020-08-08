package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="")
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='formPost' method='post'>" +
                "<div>" +
                "<h2>Name:</h2>" +
                "<input type='text' name='name'/>" +
                "</div>" +
                "<div>" +
                "<h2>My favorite language:</h2>" +
                "<select name='favorite' id='favoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</div>" +
                "<div>" +
                "<h2>My second favorite language:</h2>" +
                "<select name='secondFavorite' id='secondFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</div>" +
                "<div>" +
                "<h2>My third favorite language:</h2>" +
                "<select name='leastFavorite' id='leastFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</div>" +
                "<div>" +
                "<input type='submit' value='Submit'/>" +
                "</div>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping("formPost")
    @ResponseBody
    public String postForm(@RequestParam String name,
                           @RequestParam String favorite,
                           @RequestParam String secondFavorite,
                           @RequestParam String leastFavorite) {
        return "<html>" +
                "<body>" +
                "<table style='border:1px solid black'>" +
                "<tr>" +
                "<th style='border:1px solid black'>" + name + "</th>" +
                "</tr>" +
                "<tr style='border:1px solid black'>" +
                "<td>" + "1. "  + favorite + "</td>" +
                "</tr>" +
                "<tr style='border:1px solid black'>" +
                "<td>" + "2. "  + secondFavorite + "</td>" +
                "</tr>" +
                "<tr style='border:1px solid black'>" +
                "<td>" + "3. "  + leastFavorite + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
