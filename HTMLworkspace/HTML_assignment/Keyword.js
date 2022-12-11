function viewKeyword() {
  let tagArray = document.getElementsByClassName("keyword");
  for (let i = 0; i < tagArray.length; i++) {
    let tag = tagArray[i];
    tag.style.color = "skyblue";
  }
}
function viewCeleb() {
  let tagArray = document.getElementsByClassName("celeb");
  for (let i = 0; i < tagArray.length; i++) {
    let tag = tagArray[i];
    tag.style.color = "orange";
  }
}
