package main.java.cenglisch.hiring.domain.candidate;

import main.java.cenglisch.hiring.domain.person.PersonId;

public class Candidate {

    private final CandidateId candidateId;
    private final PersonId personId;
    private final CandidateState candidateState;

    public Candidate(CandidateId candidateId, PersonId personId, CandidateState candidateState) {
        this.candidateId = candidateId;
        this.personId = personId;
        this.candidateState = candidateState;
    }

    public void setCandidateState(CandidateState candidateState){

    }
}