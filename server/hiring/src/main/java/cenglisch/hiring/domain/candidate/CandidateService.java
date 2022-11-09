package main.java.cenglisch.hiring.domain.candidate;

import main.java.cenglisch.hiring.domain.EventHandler;
import main.java.cenglisch.hiring.domain.person.PersonId;

import java.util.Optional;

public class CandidateService {
    private final CandidateRepository candidateRepository;

    private final EventHandler eventHandler;

    public CandidateService(
            CandidateRepository candidateRepository,
            EventHandler eventHandler
    ) {
        this.candidateRepository = candidateRepository;
        this.eventHandler = eventHandler;
    }

    public void newCandidate(final PersonId personId) {
        CandidateState candidate = this.candidateRepository.create(new Candidate(personId));
    }

    private Optional<Candidate> find(final CandidateId pCandidateId) {
        return this.candidateRepository.find(pCandidateId);
    }

    public void setCandidateState(final CandidateId pCandidateId, CandidateState candidateState) {
        final Candidate candidate = find(pCandidateId).orElseThrow(CandidateException::new);
        this.candidateRepository.update(candidate);
        this.eventHandler.publish(
                CandidateStateEventFactory.make(pCandidateId, candidateState)
        );
    }
}