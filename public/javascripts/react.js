/**
 * Created by Huangshanqi on 2015/3/16.
 */
// tutorial6.js
/*
var data = [
    {author: "Pete Hunt", text: "This is one comment"},
    {author: "Jordan Walke", text: "This is *another* comment"}
];
var converter = new Showdown.converter();
var Comment = React.createClass({
    render: function() {
        return (
            <div className="comment">
                <h2 className="commentAuthor">
          {this.props.author}
                </h2>
        {converter.makeHtml(this.props.children.toString())}
            </div>
            );
    }
});
var CommentList = React.createClass({
    render: function() {
        var commentNodes = this.props.data.map(function (comment) {
            return (
                <Comment author={comment.author}>
          {comment.text}
                </Comment>
                );
        });
        return (
            <div className="commentList">
        {commentNodes}
            </div>
            );
    }
});

var CommentForm = React.createClass({
    render: function() {
        return (
            <div className="commentForm">
            Hello, world! I am a CommentForm.
            </div>
            );
    }
});

var CommentBox = React.createClass({
    render: function() {
        return (
            <div className="commentBox">
                <h1>Comments</h1>
                <CommentList data={this.props.data} />
                <CommentForm />
            </div>
            );
    }
});

 React.render(
 <CommentBox data={data} />,
 document.getElementById('content')
 );
*/
var CommentBox = React.createClass({
    render: function() {
        return (
            <div className="commentBox">
            Hello, world! I am a CommentBox.
            </div>
            );
    }
});
React.render(
    <CommentBox />,
    document.getElementById('content')
);
