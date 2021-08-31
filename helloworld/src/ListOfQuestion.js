
var question1 = {
    "questionID": 1,
    "authorID": 1,
    "subject": "Physique",
    "title": "Métodologie Scientifique",
    "wording": "La Sciences produissent-elles des véritées ?"
}
var question2 = {
  "questionID": 1,
  "authorID": 1,
  "subject": "Physique",
  "title": "Métodologie Scientifique",
  "wording": "La Sciences produissent-elles des véritées ?"
}
var question3 = {
  "questionID": 1,
  "authorID": 1,
  "subject": "Physique",
  "title": "Métodologie Scientifique",
  "wording": "La Sciences produissent-elles des véritées ?"
}

var arrayOfquestion = [question1, question2, question3];

export function listOfQuestions(){
    return arrayOfquestion
}

export function displayListElement(question){
    return <li>{question.title}</li>
}

export default listOfQuestions;