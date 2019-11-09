package se.dl.airport.async;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;


@Log4j2
@RequestMapping("/async")
@RestController
public class ComputableController {

    @GetMapping(value = "/users")
    public ResponseEntity getAsync() {
        try {
            getUsers();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("ok");
    }

    private void getUsers() throws ExecutionException, InterruptedException {
        CompletableFuture<List<User>> userList = CompletableFuture.supplyAsync(() -> {
            return getListOfUsers();
        }).thenCompose(users -> {
            List<User> upperCaseList = null;
            try {
                upperCaseList = users.get().stream().map(
                        user -> {
                            user.setFirstName(user.getFirstName().toUpperCase());
                            user.setLastName(user.getLastName().toUpperCase());
                            return user;
                        }).collect(Collectors.toList());
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            log.info("GETTING USERS");
            return CompletableFuture.completedFuture(upperCaseList);
        });
        log.info("DENNIS ASYNC");
        userList.get().forEach(System.out::println);
    }

    // Dummy method for adding List of Users
    private CompletableFuture<List<User>> getListOfUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Jack", "Reacher", "abc@xyz.com"));
        users.add(new User("Remington", "Steele", "rs@cbd.com"));
        users.add(new User("Laura", "Holt", "lh@cbd.com"));
        users.add(new User("Jonathan", "Raven", "jr@sn.com"));
        users.add(new User("Tom", "Hanson", "th@jd.com"));
        users.add(new User("Alexander", "Scott", "as@is.com"));
        users.add(new User("Jim", "Phelps", "jp@mi.com"));
        log.info("Got the users");
        return CompletableFuture.completedFuture(users);
    }
}
