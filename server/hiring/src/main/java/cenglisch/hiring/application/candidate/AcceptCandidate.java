package main.java.cenglisch.hiring.application.candidate;

import main.java.cenglisch.hiring.domain.person.PersonId;

public class AcceptCandidate {

    private final PersonId personId;

    public AcceptCandidate(PersonId personId) {
        this.personId = personId;
    }
}